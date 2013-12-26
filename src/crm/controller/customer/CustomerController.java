package crm.controller.customer;

import java.util.Enumeration;

import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 客户管理
 * @author <a mailto="hwangsyin@gmail.com">King</a>
 *
 */
@Named
@RequestMapping("/customers")
public class CustomerController {
	@RequestMapping(method=RequestMethod.GET)
	public String foo(HttpServletRequest req) throws Exception {
		Enumeration<String> names = req.getHeaderNames();
		if (names != null) {
			String name = null;
			while (names.hasMoreElements()) {
				name = names.nextElement();
				System.out.println(name + " : " + req.getHeader(name));
			}
		}
		/*
		Enumeration<String> names = req.getAttributeNames();
		PrintStream ps = null;
		if (names != null) {
			String name = null;
			while (names.hasMoreElements()) {
				name = names.nextElement();
				if (name != null) {
					if (ps == null) {
						ps = new PrintStream("/F:/tmp/req_sc_context.dump", "UTF-8");
					}
					
					ps.println(name + " : " + req.getAttribute(name));
				}
			}
		}
		
		ps.println("------------------");
		ServletContext sc = req.getServletContext();
		if (sc != null) {
			Enumeration<String> scNames = sc.getAttributeNames();
			if (scNames != null) {
				String name = null;
				while (scNames.hasMoreElements()) {
					name = scNames.nextElement();
					if (name != null) {
						if (ps == null) {
							ps = new PrintStream("/F:/tmp/req_sc_context.dump", "UTF-8");
						}

						ps.println(name + " : " + sc.getAttribute(name));
					}
				}
			}
		}

		if (ps != null) {
			ps.close();
		}
		*/
		return "customer_list";
	}
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public String addUI() {
		return "add_customer";
	}
	@RequestMapping(method=RequestMethod.POST)
	public String add() {
		return "";
	}
}
