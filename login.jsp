<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<h1>로그인 페이지</h1>
</head>
<body class="text-center">
    
<main class="form-signin">
  <form action="" method="post">
    <div class="form-floating">
      <input type="text" class="form-control" id="floatingInput" placeholder="name@example.com" name="id">
      <label for="floatingInput">id</label>
    </div>
    <div class="form-floating">
      <input type="password" class="form-control" id="floatingPassword" placeholder="Password" name="pw">
      <label for="floatingPassword">Password</label>
    </div>
    <button class="w-100 btn btn-lg btn-danger" type="submit" id="login-btn">로그인</button>
    <div class="checkbox mb-3" id="checkbox">
      <label>
        <input type="checkbox" value="remember-me"> 로그인상태 유지
      </label>
    </div>
    <p class="mt-5 mb-3 text-muted"><hr></p>
    <div class="find"><a href="find">아이디 / 비밀번호 찾기</a></div>
    <div class="join"><a href="joinmember" align="right">회원가입</a></div>
  
  </form>
</main>



  </body>
</html>