package hello;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class IssueMessageUtils {

	private IssueMessageUtils() {
		throw new IllegalStateException("Utility class");
	}
	
	private static List<String> infoMessages;
	
	private static List<String> debugMessages;

	public static String getInfoMsg() {

		if (infoMessages == null) {
			infoMessages = new ArrayList<>();
			infoMessages.add("issuegen.sso.agent.SSOAgentFilter - project name is =/My_Dashboard");
			infoMessages.add("issuegen.dsg.managed.beans.MPayBusiness - TOP UP PAY CARD payable=20");
			infoMessages.add("issuegen.bus.managed.beans.MPayBusiness - Post Paid Services payable=486.42");
			infoMessages.add("issuegen.bus.managed.beans.MPayBusiness - Recharge payable=100-1-999");
			infoMessages.add("issuegen.bus.managed.beans.MPayBusiness - TOP UP PAY CARD payable=20-1-999");
			infoMessages.add("issuegen.bus.managed.beans.MPayBusiness - TOP UP PAY CARD payable=50-1-999");
			infoMessages.add("issuegen.bus.ApplicationContextEventListener - context intializing");
			infoMessages.add("issuegen.application.config.AppConfig - APPConfig is trying to load app config from path: xxxxxxxxxx");
			infoMessages.add("issuegen.application.config.AppConfig - APPConfig initialized successfully");
			infoMessages.add("issuegen.agent.util.SSOAgentConfigs - SSOConfig is trying to load app config from path: xxxxxxxxxx");
			infoMessages.add("issuegen.agent.util.SSOAgentConfigs - SSOConfig initialized successfully");
			infoMessages.add("issuegen.SSOAgentHttpSessionListener - session created");
			infoMessages.add("issuegen.sso.agent.SSOAgentFilter - project name is =/BillPay");
			infoMessages.add("issuegen.agent.saml.SAML2SSOManager - <?xml version=\"1.0\" encoding=\"UTF-8\"?>");
			infoMessages.add("issuegen.myid.servlet.ForwardingServlet - user info successfully loaded");
			infoMessages.add("issuegen.sso.agent.SSOAgentFilter - project name is =/logAudit");
			infoMessages.add("issuegen.m.beans.CarRenewalManagedBean - ***loading Audit page**");
			infoMessages.add("issuegen.util.SessionIdGeneratorBase - Creation of SecureRandom instance for session ID generation took [350,333] milliseconds.");
			infoMessages.add("issuegen.managed.beans.JourneyPlannerMB - json : {\"listIcon\":\"\",\"showDirectionPanel\":false,\"showMyPlacesTab\":false,\"showNolTab\":false,\"applicationId\":1,\"mapSize\":0,\"locations\":[]}");
			infoMessages.add("issuegen.service.MicroAppResponse - pagerServices size: 28");
			infoMessages.add("issuegen.service.MicroAppResponse - categoryServices size: 26");
			infoMessages.add("issuegen.service.MicroAppResponse - categoryOneServices size: 1250");
			infoMessages.add("issuegen.AuthenticationInterceptor - authorizationValid: start");
		}

		return getRandomMsg(infoMessages);

	}
	
	
	public static String getDebugMsg() {

		if (debugMessages == null) {
			debugMessages = new ArrayList<>();
			debugMessages.add("issuegen.opensaml.xml.XMLConfigurator - Loading configuration from XML Document");
			debugMessages.add("issuegen.opensaml.xml.XMLConfigurator - Schema validating configuration Document");
			debugMessages.add("issuegen.opensaml.xml.XMLConfigurator - Configuration document validated");
			debugMessages.add("issuegen.opensaml.xml.XMLConfigurator - Preparing to load ObjectProviders");
			debugMessages.add("issuegen.opensaml.xml.XMLConfigurator - Initializing object provider");
			
		}

		return getRandomMsg(debugMessages);

	}

	private static String getRandomMsg(List<String> list) { 
		return list.get(new Random().nextInt(list.size())); 
	}
}
