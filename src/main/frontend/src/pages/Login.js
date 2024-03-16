import axios from "axios";
import React, { useState } from "react";
import { useNavigate } from "react-router-dom";

export default function Login() {
  const [userId, setUserId] = useState("");
  const [password, setUserPwd] = useState("");
  const [member, setMember] = useState(null);
  const navigate = useNavigate();

  const handleUserId = (e) => {
    const id = e.target.value;
    setUserId(id);
  };

  const handleUserPwd = (e) => {
    const pwd = e.target.value;
    setUserPwd(pwd);
  };

  const handdleLoginSubmit = (e) => {
    e.preventDefault();
    setMember({
      userId: userId,
      password: password,
    });
    const loginProcess = async () => {
      axios
        .post("/coscos/doLogin", member)
        .then((response) => console.log(response))
        .catch((error) => console.log(error));
    };
    loginProcess();
    navigate("/");
  };

  return (
    <section id="login">
      <div className="container">
        <div className="row">
          <div className="login">
            <form className="login_form">
              <div className="login_form_box login_id">
                <label htmlFor="usename">아이디</label>
                <input
                  className="login_id"
                  type="text"
                  name="userId"
                  onChange={handleUserId}
                  placeholder="아이디를 입력하세요"
                />
              </div>
              <div className="login_form_box login_pwd">
                <label htmlFor="password">비밀번호</label>
                <input
                  className="login_pwd"
                  type="text"
                  name="password"
                  onChange={handleUserPwd}
                  placeholder="비밀번호를 입력하세요"
                />
              </div>
              <div>
                <div>
                  <button className="loginBtn" onClick={handdleLoginSubmit}>
                    로그인
                  </button>
                </div>
              </div>
            </form>
          </div>
        </div>
      </div>
    </section>
  );
}
