import { Link } from "react-router-dom";
import { styled } from "styled-components";

const HeaderDiv = styled.div`
  display: flex;
  justify-content: center;
  align-items: center;
  width: 100%;
  background-color: darkgray;
`;

const HeaderH1 = styled.h1``;

const HeaderLink = styled(Link)`
  text-decoration: none;
  color: black;
  font-family: "Papyrus", fantasy;
`;

const Header = () => {
  return (
    <HeaderDiv>
      <HeaderH1>
        <HeaderLink>IssueKr</HeaderLink>
      </HeaderH1>
    </HeaderDiv>
  );
};

export default Header;
