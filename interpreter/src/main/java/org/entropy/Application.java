package org.entropy;

import org.entropy.expression.AndExpression;
import org.entropy.expression.Expression;
import org.entropy.expression.OrExpression;
import org.entropy.expression.TerminalExpression;

public class Application {

    // rules: both the 'server' and the 'client' words are required
    public static Expression webAppExpression() {
        Expression server = new TerminalExpression("server");
        Expression client = new TerminalExpression("client");
        return new AndExpression(server, client);
    }

    // rules: 'webui' or 'gui' words are required
    public static Expression uiExpression() {
        Expression webui = new TerminalExpression("webui");
        Expression gui = new TerminalExpression("gui");
        return new OrExpression(webui, gui);
    }

    public static void main(String[] args) {
        Expression webApp = webAppExpression();
        System.out.println(webApp.interpret("only server"));
        System.out.println(webApp.interpret("only client"));
        System.out.println(webApp.interpret("server and client"));
        System.out.println(webApp.interpret("srv and client"));

        Expression ui = uiExpression();
        System.out.println(ui.interpret("only webui"));
        System.out.println(ui.interpret("only gui"));
        System.out.println(ui.interpret("webui and gui"));
        System.out.println(ui.interpret("web ui and g ui"));
    }
}
