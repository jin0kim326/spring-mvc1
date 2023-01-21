package hello.servlet.basic.request;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * 1.파라미터 전송 기능
 * http://localhost:8080/request-param?username=jinyoung?age=20
 *
 * => 1.쿼리스트링
 * => 2.HTML Form형식으로 온것도 가능 
 */
@WebServlet(name = "requestParamServlet", urlPatterns = "/request-param")
public class RequestParamServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("[전체 파라미터 조회] - 👉🏻");
        request.getParameterNames().asIterator()
                .forEachRemaining(paramName -> System.out.println(paramName +" >> " +request.getParameter(paramName)));
        System.out.println("[전체 파라미터 조회] - ✅");
        System.out.println();

        System.out.println("[단일 파라미터 조회] 👉");
        String username = request.getParameter("username");
        String age = request.getParameter("age");

        System.out.println("username = " + username);
        System.out.println("age = " + age);
        System.out.println("[단일 파라미터 조회] ✅");

        System.out.println("[이름이 같은 복수 파라미터 조회] 👉");
        String[] usernames = request.getParameterValues("username");
        for (String s : usernames) {
            System.out.println("username = " + s);
        }
        System.out.println("[이름이 같은 복수 파라미터 조회] ✅");

        response.getWriter().write("OK");
    }
}
