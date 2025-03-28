package com.helloworld.quickstart.controller;

import com.helloworld.quickstart.connected.Member;
import com.helloworld.quickstart.dto.MemberRequestDto;
import com.helloworld.quickstart.dto.MemberUpdateDto;
import com.helloworld.quickstart.repository.MemberRepository;
import com.helloworld.quickstart.service.MemberService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;



@RestController
@RequestMapping("/member")
@Tag(name = "Member API", description = "회원 관리 API")
public class MemberController {

    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    // ✅ [1] 모든 회원 조회
    @Operation(summary = "전체 회원 목록 조회", description = "DB에 저장된 모든 회원 데이터를 가져옵니다.")
    @GetMapping
    public List<Member> getAllMembers() {
        return memberService.getAllMembers();
    }

    // ✅ [2] 회원 추가
    @Operation(summary = "회원 추가", description = "새로운 회원을 추가합니다.")
    @PostMapping("/add")
    public ResponseEntity<Member> addMember(@RequestBody Member member) {
        Member savedMember = memberService.addMember(member);
        return ResponseEntity.ok(savedMember);
    }

    // ✅ [3] 회원 삭제 (studentId로)
    @Operation(summary = "회원 삭제", description = "studentId를 기준으로 회원을 삭제합니다.")
    @DeleteMapping("/delete/{studentId}")
    public ResponseEntity<String> deleteMember(@PathVariable int studentId) {
        boolean isDeleted = memberService.deleteMemberByStudentId(studentId);
        if (isDeleted) {
            return ResponseEntity.ok("✅ '" + studentId + "' 학번 회원이 삭제되었습니다.");
        } else {
            return ResponseEntity.badRequest().body("❌ '" + studentId + "' 학번 회원을 찾을 수 없습니다.");
        }
    }

    // ✅ [4] 회원 정보 수정 (studentId로 찾기)
    @Operation(summary = "회원 정보 수정", description = "studentId를 기준으로 회원 정보를 수정합니다.")
    @PutMapping("/update/{studentId}")
    public ResponseEntity<?> updateMember(@PathVariable int studentId, @RequestBody MemberUpdateDto updateDto) {
        Optional<Member> updatedMember = memberService.updateMemberByStudentId(studentId, updateDto);

        if (updatedMember.isPresent()) {
            return ResponseEntity.ok(updatedMember.get());
        } else {
            return ResponseEntity.badRequest().body("❌ '" + studentId + "' 학번 회원을 찾을 수 없습니다.");
        }
    }
}