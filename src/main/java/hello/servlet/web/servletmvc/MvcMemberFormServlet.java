package hello.servlet.web.servletmvc;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "mvcMemberFormServlet", urlPatterns = "/servlet-mvc/members/new-form")
public class MvcMemberFormServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String viewPath = "/WEB-INF/views/new-form.jsp";    //jsp 경로 : WAS서버 role - WEB-INF에 넣으면 url경로를 통해 직접접근이 불가능함 (/jsp/... 은 직접접근가능했음)
        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath); //컨트롤러 -> view로 이동하기 위해 디스패쳐를 사용
        dispatcher.forward(request, response);
        // forward() 메서드를 사용해서 서블릿에서 jsp를 호출
        // * forward()는 서버 내부에서 다시 호출 발생 (redirect와는 달리, 서버안에서 동작하여 jsp를 반환)
        /**
         * Redirect vs Forward
         * - 리다이렉트는 실제 클라이언트에 응답이 나갔다가, 클라이언트가 redirect경로로 다시 요청 -> 클라이언트 인지 및 url경로도 실제로 변경됨
         * - 포워드는 서버 내부에서 일어나는 호출이기 때문에 클라이언트가 인지할 수 없음
         */
    }
}
