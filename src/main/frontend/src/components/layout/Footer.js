import React from "react";
import { Link } from "react-router-dom";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import {
  faTwitter,
  faInstagram,
  faYoutube,
  faFacebookF,
} from "@fortawesome/free-brands-svg-icons";

export default function Footer() {
  const env = process.env;
  env.PUBLIC_URL = env.PUBLIC_URL || "";

  return (
    <footer id="footer">
      <div className="container">
        <div className="row">
          <div className="footer">
            <div className="footer_info">
              <div className="footer_info_top footer_box">
                <ul>
                  <li>
                    <Link href="#">
                      <img src={`${env.PUBLIC_URL}/logo192.png`} alt="test" />
                    </Link>
                  </li>
                  <li>
                    <Link href="#">공지사항</Link>
                  </li>
                  <li>
                    <Link href="#">자주묻는 질문</Link>
                  </li>
                </ul>
              </div>
              <div className="footer_info_bottom footer_box">
                <ul>
                  <li>대표: 테스트</li>
                  <li>전화번호: 010-1234-0987</li>
                  <li>주소: 인천광역시 연수구 옥련동</li>
                  <li>이메일: coscos@coscos.com</li>
                </ul>
              </div>
              <div className="footer_rights footer_box">
                <p>Copyright 2024 by COSCOS. All right reserved</p>
              </div>
            </div>
            <div className="footer_sns">
              <ul>
                <li>
                  <Link href="#">
                    <FontAwesomeIcon icon={faTwitter} size="2xl" />
                  </Link>
                </li>
                <li>
                  <Link href="#">
                    <FontAwesomeIcon icon={faFacebookF} size="2xl" />
                  </Link>
                </li>
                <li>
                  <Link href="#">
                    <FontAwesomeIcon icon={faInstagram} size="2xl" />
                  </Link>
                </li>
                <li>
                  <Link href="#">
                    <FontAwesomeIcon icon={faYoutube} size="2xl" />
                  </Link>
                </li>
              </ul>
            </div>
          </div>
        </div>
      </div>
    </footer>
  );
}
