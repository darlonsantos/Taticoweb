package app.devmedia.com.br.appdevmedia.util;

import com.paypal.android.sdk.payments.PayPalConfiguration;
import com.paypal.android.sdk.payments.PayPalPayment;

/**
 * Created by Diogo Souza on 12/11/2015.
 */
public class Constantes {

    public static final String PAYPAL_CLIENT_ID = "AZjA6YitIe1RzzGlbHRbcVWEk4k2wP6udXCOeQKGXk5yiau7wBpRNtZ-plRcS1-4YuLrilCokFCfFQ3S";

    public static final String PAYPAL_CLIENT_SECRET = "z5vkH3ps89BGwsE7KHZmAM14FPMrytGGB67lDRjfJFKnORQv_pJFY6LE9ZQcAeTEhvJWXW";

    public static final String PAYPAL_ENV = PayPalConfiguration.ENVIRONMENT_SANDBOX;

    public static final String PAYPAL_INTENT = PayPalPayment.PAYMENT_INTENT_SALE;

    public static final String PAYPAL_CURRENCY = "BRL";

    // URLs dos serviços
    public static final String URL_WEB_BASE = "http://192.168.1.34:8080/rest-web/";

    public static final String URL_WS_BASE = "http://192.168.1.34:8080/rest-web/rest/";

    public static final String URL_WS_PRODUTOS = URL_WS_BASE + "produto/list";

    public static final String URL_WS_CHECK_PAYMENT = URL_WS_BASE + "cart/checkPagto";
}
