<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아이디/비밀번호 찾기</title>
</head>
<body>
<h1>아이디/비밀번호 찾기</h1>
</body>
<body>
    <center>
        <div class="start">
            <!-- 아이디찾는 부분 -->
            <h2>아이디 찾기</h2>
            <hr>
            <form class="row g-3" action="${urlHome }membership/findId" id="emailgo" method="POST">
                <div class="col-8">
                    <label for="email" class="form-label">이메일</label>
                    <input type="email" class="form-control" name="email" id="email" placeholder="이메일 주소">
                </div>
                <div class="col-2" id="btn1">
                    
                    <input type="button" value="전송" id="findid" class="btn btn-danger">
                </div>
            </form>

            <!-- 비번찾는 부분 -->
            <form class="row g-3" id="find-pw" action="${urlHome }membership/findPw" method="POST" id="emailgo2">
                <h2>비밀번호 찾기</h2>
                <hr>
                <div class="col-8">
                    <label class="form-label">아이디</label>
                    <input type="text" class="form-control" placeholder="아이디" id="id" name="id">
                </div>
                <div class="col-8">
                    <label for="inputEmail4" class="form-label">이메일</label>
                    <input type="email" class="form-control" id="inputAddress2" name="email" placeholder="이메일 주소">
                </div>
                <div class="col-2" id="btn2">
                    <button id="findpw" class="btn btn-danger">전송</button>
                </div>
            </form>
            
            <div class="d-grid gap-2" style="margin-top: 50px;">
                <button type="submit" onclick="location.href='login'" class="btn btn-danger">로그인 화면으로</button>
            </div>
       
        
        </div>
    </center>
</html>