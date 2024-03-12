import React from "react";

export default function Login() {
  return (
    <section id="login">
      <div className="container">
        <div className="row">
          <form className="login_form">
            <div className="login_form_box login_id">
              <label For="usename">아이디</label>
              <input
                className="login_id"
                type="text"
                name="username"
                placeholder="아이디를 입력하세요"
              />
            </div>
            <div className="login_form_box login_pwd">
              <label For="usename">비밀번호</label>
              <input
                className="login_pwd"
                type="text"
                name="password"
                placeholder="비밀번호를 입력하세요"
              />
            </div>
          </form>
        </div>
      </div>
    </section>
  );
}
