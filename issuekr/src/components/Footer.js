import { styled } from "styled-components";

const FooterDiv = styled.div`
  display: flex;
  justify-content: center;
  background-color: lightgray;
`;
const FooterP = styled.p`
  color: gray;
`;

const Footer = () => {
  return (
    <FooterDiv>
      <FooterP>By MarminDev</FooterP>
    </FooterDiv>
  );
};
export default Footer;
