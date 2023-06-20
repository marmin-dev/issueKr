import { styled } from "styled-components";

export const ResponsiveDiv = styled.div`
  @media (max-width: 480px) {
    width: 450px;
  }
  @media (max-width: 768px) {
    width: 750px;
  }
  @media (max-width: 1024px) {
    width: 950px;
  }
  @media (max-width: 1600px) {
    width: 1500px;
  }
  @media (min-width: 1600px) {
    width: 1600px;
  }
`;
