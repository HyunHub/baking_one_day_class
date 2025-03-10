package jsp.member.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jsp.common.util.Action;
import jsp.common.util.ActionForward;

public class MemberLogoutAction implements Action {

	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

		ActionForward forward = new ActionForward();

		// 로그아웃시 세션정보를 모두 삭제한다.
		request.getSession().invalidate();

		// 로그아웃 후 메인화면으로 돌아간다.
		forward.setRedirect(true);
		forward.setNextPath("MainForm.do");

		return forward;
	    }
}
