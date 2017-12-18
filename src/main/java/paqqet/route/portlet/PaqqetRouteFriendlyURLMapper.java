package paqqet.route.portlet;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.portlet.DefaultFriendlyURLMapper;
import com.liferay.portal.kernel.portlet.FriendlyURLMapper;

import paqqet.route.constants.PaqqetRoutePortletKeys;

@Component(
	    property = {
	    	"com.liferay.portlet.friendly-url-routes=META-INF/friendly-url-routes/routes.xml",
	        "javax.portlet.name=" + PaqqetRoutePortletKeys.PaqqetRoute
	    },
	    service = FriendlyURLMapper.class
	)
public class PaqqetRouteFriendlyURLMapper extends DefaultFriendlyURLMapper {
	@Override
    public String getMapping() {
        return _MAPPING;
    }

    private static final String _MAPPING = "paqqet";
}
