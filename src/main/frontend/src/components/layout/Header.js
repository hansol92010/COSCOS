import React from "react";
import { Link } from "react-router-dom";

export default function Header() {
  const env = process.env;
  env.PUBLIC_URL = env.PUBLIC_URL || "";

  return (
    <header id="header">
      <div className="container">
        <div className="row">
          <div className="header">
            {/* 로고 */}
            <h1>
              <Link>
                <em>
                  <img src={`${env.PUBLIC_URL}/logo192.png`} alt="logo" />
                </em>
              </Link>
            </h1>

            {/* 메뉴 */}
            <div className="user_menu">
              <ul>
                <li>
                  <Link to="/coscos/login">로그인</Link>
                </li>
                <li>
                  <Link>마이페이지</Link>
                </li>
                <li>
                  <Link>장바구니</Link>
                </li>
              </ul>
            </div>
          </div>

          <div className="cosmetic_menu">
            <ul>
              <li>
                <Link>스킨케어</Link>
              </li>
              <li>
                <Link>메이크업</Link>
              </li>
              <li>
                <Link>바디/헤어</Link>
              </li>
              <li>
                <Link>남성</Link>
              </li>
            </ul>
          </div>
        </div>
      </div>
    </header>
  );
}
