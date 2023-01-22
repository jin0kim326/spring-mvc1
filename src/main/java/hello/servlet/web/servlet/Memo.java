package hello.servlet.web.servlet;

public class Memo {
    /**
     * FrontController 패턴 특정
     * - 서블릿 하나로 클라이언트 요청을 받음
     * - 프론트 컨트롤러가 요청에 맞는 컨트롤러를 찾아서 호출
     * - 입구를 하나로
     * - 공통처리 가능
     * - **프론트 컨트롤러를 제외한 나머지 컨트롤러는 서블릿을 사용하지 않아도 됨
     *
     * 🔥 스프링 웹 MVC와 프론트 컨트롤러
     * - 스프링 웹 MVC의 핵심도 바로 FrontController
     * - 스프링 웹 MVC의 DispatcherServlet이 FrontController 패턴으로 구현되어 있음
     */
}
