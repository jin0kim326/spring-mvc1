package hello.servlet.web.frontcontroller.v1.controller;

import hello.servlet.web.frontcontroller.v1.ControllerV1;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class MemberFormControllerV1 implements ControllerV1 {
    @Override
    public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String viewPath = "/WEB-INF/views/new-form.jsp";    //jsp 경로 : WAS서버 role - WEB-INF에 넣으면 url경로를 통해 직접접근이 불가능함 (/jsp/... 은 직접접근가능했음)
        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath); //컨트롤러 -> view로 이동하기 위해 디스패쳐를 사용
        dispatcher.forward(request, response);
    }
}
