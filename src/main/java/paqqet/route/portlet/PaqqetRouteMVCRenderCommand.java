package paqqet.route.portlet;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.util.ParamUtil;

import paqqet.route.constants.PaqqetRoutePortletKeys;

@Component(
	    immediate = true,
	    property = {
	        "javax.portlet.name=" + PaqqetRoutePortletKeys.PaqqetRoute, 
	        /*"mvc.command.name=/",*/
	        "mvc.command.name=/paqqet"
	    },
	    service = MVCRenderCommand.class
	)

public class PaqqetRouteMVCRenderCommand implements MVCRenderCommand {

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		String paqqetName = ParamUtil.getString(renderRequest, "paqqetName");
//		renderRequest.getAttribute("paqqetName");
		System.out.println("paqqetName: "+paqqetName);
//register
		
		return "/view.jsp";
	}

}
