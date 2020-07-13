package com.caofuqiang.action;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayTradeWapPayModel;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayTradeWapPayRequest;
import com.caofuqiang.aliConfig.AlipayConfig;
import com.caofuqiang.entity.Goods;
import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.*;

@RestController
@RequestMapping("pay")
public class AliPay {
    //支付宝支付
    @RequestMapping("ali")
    public String pay(Goods goods){
        goods.setOut_trade_no(UUID.randomUUID().toString().replace('-',' '));
        goods.setProduct_code("FAST_INSTANT_TRADE_PAY");
        goods.setSubject("测试支付");
        goods.setProduct_code("1111");
        goods.setTimeout_express("10");
        goods.setTotal_amount("100.0");
        AlipayClient client = new DefaultAlipayClient(AlipayConfig.URL, AlipayConfig.APPID, AlipayConfig.RSA_PRIVATE_KEY, AlipayConfig.FORMAT, AlipayConfig.CHARSET, AlipayConfig.ALIPAY_PUBLIC_KEY,AlipayConfig.SIGNTYPE);
        AlipayTradeWapPayRequest alipay_request=new AlipayTradeWapPayRequest();
        alipay_request.setBizContent(new Gson().toJson(goods));
        // 设置异步通知地址
        alipay_request.setNotifyUrl(AlipayConfig.notify_url);
        // 设置同步地址
        alipay_request.setReturnUrl(AlipayConfig.return_url);

        // form表单生产
        String form = "";
        try {
            // 调用SDK生成表单
            String str= client.pageExecute(alipay_request).getBody();
            return str;

        } catch (AlipayApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return null;
    }
    @RequestMapping("wx")
    //没有进行开发
    public String wx(){

        return "正在拉起微信支付。。。。。";
    }
    @RequestMapping("sign")
    public String sign(HttpServletRequest request) throws AlipayApiException {
        Map<String, String[]> parameterMap = request.getParameterMap();
        String public_key="";
        String utf_8="utf-8";
        boolean b = AlipaySignature.rsaCheckV1(getParamsMap(request), AlipayConfig.ALIPAY_PUBLIC_KEY, utf_8);
        if(b){
            return "success";
        }
        return "error";

    }
    private Map<String, String> getParamsMap(HttpServletRequest request) {
        Map<String,String> params = new HashMap<>();
        Map requestParams = request.getParameterMap();
        for (Iterator iter = requestParams.keySet().iterator(); iter.hasNext();) {
            String name = (String) iter.next();
            String[] values = (String[]) requestParams.get(name);
            String valueStr = "";
            for (int i = 0; i < values.length; i++) {
                valueStr = (i == values.length - 1) ? valueStr + values[i]
                        : valueStr + values[i] + ",";
            }
            //乱码解决，这段代码在出现乱码时使用
            try {
                valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
                params.put(name, valueStr);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return params;
    }
}
