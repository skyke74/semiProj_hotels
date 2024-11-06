<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<%@include file="../template/head.jspf" %>
<%@include file="../css/signup_css.jspf" %>
<script>
	function validateForm() {
	    const name = document.getElementById("name").value;
	    const email = document.getElementById("email").value;
	    const password = document.getElementById("password").value;
	    const confirmPassword = document.getElementById("confirm-password").value;
	    const address = document.getElementById("address").value;
	    const tel = document.getElementById("tel").value;
	    const birthdate = document.getElementById("birth_date").value;
	    const terms = document.getElementById("terms").checked;
	
	    // 각 필드가 비어 있는지 확인
	    if (!name || !email || !password || !confirmPassword || !address || !tel || !birthdate) {
	        alert("모든 정보를 작성하세요");
	        return false;
	    }
	
	    // 비밀번호 일치 여부 확인
	    if (password !== confirmPassword) {
	        alert("비밀번호가 일치하지 않습니다.");
	        return false;
	    }
	
	    // 비밀번호 길이 확인 (8자리 이상)
	    if (password.length < 8) {
	        alert("비밀번호는 8자리 이상이어야 합니다!");
	        return false;
	    }
	
	    // 이용 약관 동의 여부 확인
	    if (!terms) {
	        alert("이용약관에 동의하세요.");
	        return false;
	    }
	
	    // 모든 검사를 통과하면 true 반환
	    return true;
	}
	
</script>
</head>
<body>
<%@include file="../template/menu.jspf" %>
    <div class="signup-container">
        <h2>회원가입</h2>
        <form action="${root}/signup/new" method="post">
            <label for="name">이름</label>
            <input type="text" id="name" name="name" required>

            <label for="email">이메일</label>
            <input type="email" id="email" name="email" required>

            <label for="password">비밀번호</label>
            <input type="password" id="password" name="password" required>

            <label for="confirm-password">비밀번호 확인</label>
            <input type="password" id="confirm-password" name="confirm-password" required>

            <label for="adress">주소</label>
            <input type="text" id="address" name="address" required>

            <label for="tel">전화번호</label>
            <input type="tel" id="tel" name="tel" required>

            <label for="birthdate">생년월일</label>
            <input type="date" id="birth_date" name="birth_date" required min="1940-01-01", max="2024-12-31">

            <div class="agreement-section">
                <label class="checkbox-label">
                    <input type="checkbox" id="terms" name="terms" required>
                    <span>개인정보 수집 및 이용에 동의합니다.</span>
                </label>
                <label class="checkbox-label">
                    <input type="checkbox" id="marketing" name="marketing">
                    <span>마케팅 정보 수신에 동의합니다.</span>
                </label>
            </div>

            <div class="button-container">
                <p>
                    <button type="submit" class="btn btn-primary btn-lg confirm-btn" >확인</button>
                    <button type="button" class="btn btn-default btn-lg cancel-btn" onclick="goBack()">취소</button>
                </p>
            </div>
        </form>
    </div>
<script type="text/javascript">
function goBack() {
    window.history.back();  // 이전 페이지로 돌아가기
}

$('form').one('submit',e=>{
	validateForm();
});
</script>
</body>
</html>