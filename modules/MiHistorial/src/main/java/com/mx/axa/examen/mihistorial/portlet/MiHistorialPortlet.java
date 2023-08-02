package com.mx.axa.examen.mihistorial.portlet;

import com.mx.axa.examen.mihistorial.constants.MiHistorialPortletKeys;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author tuxtl
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.mihistorial",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=MiHistorial",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + MiHistorialPortletKeys.MIHISTORIAL,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class MiHistorialPortlet extends MVCPortlet {
	
	  @Override
	    public void serveResource(ResourceRequest request, ResourceResponse response) throws PortletException {
	        
	        
	    }

	    @Override
	    public void render(RenderRequest request, RenderResponse response) throws PortletException {
	       
	    }

	    @Override
	    public void processAction(ActionRequest request, ActionResponse response) throws PortletException {
	    }
}