package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016100100640594";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCzDWCR6lrJwtZFzs83w7GmIfVNHPUt7tmkBfaDW/GeUVT13YOnqW1zhCqdIjuwsWU0HXWZjMuTIy/QWiRNn1aFoHkzunesowx+PGGESCKsFNgKcSNL1LrqCu8oD1+L2TGZoZPyVPZND5R/9jMhIi3Ei3rZxT7NXv44C9sy8n66QyxLPhXrocVSpPNTrtC+5O65DwdYVqWo6x6JuMSdDnn/aTfp5WgIyWQsYT0wPRoqNNESip0cXZyBB8qssi5PMBVyCj0CpoIj1nYzgEeTzYZb5NGG17WD6W+ZYSDzaqRviGPi/zK9pl2uoTHPZc8ePM5FHCnvIZcHYYP1Fv772yQxAgMBAAECggEALp1e9N4UgM6OxmHPJO93wo64tDjDxA+Y7dD3mr9HKjZ2bgQbkHzVl+tixMHy1E96z5ST10QGg+n3OsEdDnBbMDLVGxiCq5lPWVYS9UNqc26ByEYoMEfT2ba7CKzn7RrAhQTB5ack8G8L9Dx+lzO0wqSleSiW7xS6DpFXoe3r/EWs0ukPwt1cgfvWgGKjDd4G0qA8dMrJy4Ge+Lq7fbXy1QD1miBUIPuuf7hFoMV+0oXy1kWq+3uP6AGFLOVQmHsXeYWNEiNBcxNPirQlTQcuhNlw/xX9R0by2hghXaogiCNu60hb3d1oq6+xkfTBYFshYxXe6O7SAooP1KomU2XRgQKBgQDpFkzBOkWty8N/hfVCUQyHig0Aznq2YjEAubJ857UvXGK0eJOOIEuzJhdp0/kMmqtEChgoZDNUhLXz5OJkBjMBwhwi9Mo0F3x5Uy8gLyg4a8qw82jTs4bmjC79le/cAP1PZVhIA8y6Ce51Wxuh9HIgpasB0hBf9w2KYUKyTV4BmQKBgQDEp0aS9gBtHr88WFh8/JuvpMYz9JwRgt9KGXWEaIlEOxSEqB2iEr7RLB3+UQah3GghoVyASQlfEYOa2Q8deI5oRWpjCeyyD4Ve0qNQ94dVQmpIDw1Zlnc1hed0sMKPQx829aK6f9rr6qv+1nETusikOh2NzJ6KIteOKs0FzxsGWQKBgQCQT7415F4/vGjOC6JN7OBVCqQCW9SeFy0/xbk8nDkRmaGDGyRAWr6DrJHSc+s+YoSnG5jZaTBeo8wDtTJ1u2DZNdU1z1lh5yip9Va4FnpQdGyKIipE6GIdW628U5iuHe63uYdvDusyQ/PftQjmvPHsRKYb+nMo90zq4EzrF/ucAQKBgFZpostlKd7JSgM8VvXlEoxl/WpLLGFNfszSzx71yIug4m1AanUTg6Hqnutns2Bgt6k/fKQqc+HAknHyu3+ZwAn1psAKVmYQB+0Y5gboHiHK42TyqE0bnxp30rMmEPhe6FKAMZd+IzbTkeyTUnD2/L+dgesTZP8SPGIOULUiwp9RAoGBANyk9pn8pflwYeJ6bq4Q0wGA0zqmWBSpXad5EVy1WrHOgRz57siXjOEKimHTFhD9sUz1CQhKy1Uczu6tqsu/ufvV9/AbBSCJt/gBOSmheAcL5/z5udF3o+/xkmCidij+xApqRcQBt1SpuVmpJr/rrSBJJWecHUgCveRPnjfL4in1";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAivyVDvMqJ7CQZ+AF5SlRNm+kjHT7xmIorJBwdW13HjqAVz7XLpplW7gVa9wfbdPTkht/cG05F8sodU3KsSDwXX/8bsylTyqy6+RRwZloNYaF5D35FWqnI8N99IkGMHk8ON2cjpfI9pdvCcFnqdBjtJcRR+kG6VUUIXW8hNPZ83UJHwGwKPqAy9n+PF/MWno5ct7PDfmGDwYIGRm8s33I1XCSYojMDNDxiz+nmNvsSDhesOOeRhEaOgj1CarX/Ku/UVZGaqxPtm9t5uFMA1XRkDi7/lF0HhKFpuOQ6lDm1IueUNn2WHZBfJw660PcfpqnyfM+lhOPkwToyHuSJSbXdwIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://localhost:8080/SecondHandCar/car-bill.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://localhost:8080/SecondHandCar/404.jsp";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

