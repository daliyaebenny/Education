package com.company.Action;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.company.Form.LoginForm;
import com.company.resources.ApplicationConstants;
import com.company.resources.DatabaseAccess;

public class SignUpAction extends org.apache.struts.action.Action {
	/**
	 * This is the action called from the Struts framework.
	 * @param mapping : The ActionMapping used to select this instance.
	 * @param form : The optional ActionForm bean for this request.
	 * @param request : The HTTP Request we are processing.
	 * @param response : The HTTP Response we are processing.
	 * @throws java.lang.Exception
	 */

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		LoginForm loginForm = (LoginForm) form;

		String ret = ApplicationConstants.FAILURE;
		Connection conn = null;

		try {
			conn = DatabaseAccess.getConnection();
			PreparedStatement ps = conn.prepareStatement(ApplicationConstants.userInsert);
			ps.setString(1, loginForm.getName());
			ps.setString(2, loginForm.getUserName());
			ps.setString(3, loginForm.getPassword());
			ps.executeUpdate();
			ret = ApplicationConstants.SUCCESS;

		} catch (Exception e) {
			ret = ApplicationConstants.FAILURE;
		} finally {
			if (conn != null) {
				DatabaseAccess.closeConnection(conn);
			}
		}
		return mapping.findForward(ret);
	}
}
