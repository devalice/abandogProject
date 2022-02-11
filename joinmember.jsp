<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
<h1>회원가입 페이지</h1>
</body>
<body>
    <center>
    <div class = "start">
        <h1>회원 가입</h1>
        <hr>
        <form class="row g-3" action="" method="post">
            <div class="col-12">
                <label class="form-label">이메일</label>
                <input type="text" class="form-control" required onchange="checkId()" id="email" name="email">

            </div>
            <div class="col-md-6">
            <label for="inputPassword4" class="form-label">비밀번호</label>
            <input type="password" class="form-control" id="pw" name="pw" required>
         
            </div>
            <div class="col-md-6">
            <label for="inputPassword4" class="form-label">비밀번호(확인)</label>
            <input type="password" class="form-control" id="pwpw" required onchange="checkpass()">
            </div>
            <div class="col-12">
                <label class="form-label">이름</label>
                <input type="text" class="form-control" name="name" required>
            </div>
            <div class="col-12">
                <label for="birth" class="form-label">생년월일</label>
                <input type="email" class="form-control" name="birth"id="birth" required>
            </div>
            <div class="col-md-4">
            
                <label for="gender" class="form-label">성별</label>
                <input type = "radio" value="male" name="gender"/>남
                <input type = "radio" value="female" name="gender"//>여
            </div>
            <div class="col-12">
                <label for="phone" class="form-label">전화번호</label>
                <input type="phone" class="form-control" name="phone"id="phone" required>
            </div>
            <div class="col-12">
            <label for="addr" class="form-label">주소</label>
            <input type="text" class="form-control" id="addr" placeholder="주소" name="addr" required>
           
            <div class="d-grid gap-2" style="margin-top: 50px;">
            <button type="button" onclick="location.href='login'" class="btn btn-danger">회원 가입</button>
            </div>
        </form>
    </div>
</center>
</body>
</html>