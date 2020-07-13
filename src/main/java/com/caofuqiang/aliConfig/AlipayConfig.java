package com.caofuqiang.aliConfig;

public class AlipayConfig {

	public static String APPID = "2016101200668280";//键入沙箱环境应用id
     //键入自己生成的私钥将对应的公钥交给支付宝索取支付宝的公钥
	public static String RSA_PRIVATE_KEY = "BOeT4Pk9ZB2sg5OGW3S3K18hfMzwZf0JwSQoA+aQIkE9q/2Nir16VLxNXRY/bfo/4KuO2VSHL9pxVQeW7ifVgp3uy+x5G/uqHxE+1cF+0ZU3iCGn0hHKrHuR/Q3vnPX0x+wNC1+CXSJW0chsVPfMAEFuO/MLi8nHkZHLef9UU979HfXSY6yjGD4RaMntp2C2SSb/3vJBF4qHwUgYiBLDbXjgmimt4/Mafkbq3+37rK5O/9zKsHFLdBuYoCLlQ78dFLh5507vpdcVi9FZ7qRl1AqqykhMQKBgQDVnN0yaEbIL9NNX7PJAStBg4nJaoVgtalak6kORMf6MqWfdYLRltTcp/DLNWIH2hgs1BYGHbYAlIGa3tbrCaSl0Qk9yvwiAxMty8XvEX/FzUhvrwfKWdSss/zA+i86/6UZnzPA1zlhHV1Mmc3xcw8Dc84WG+h8kR91ItYbdOmo+QKBgQDOmtg8ODqV9TyTLppZ4aD0Ku4IaoL8COzySmCcFwbrcJ4Qy6cDmg3v6ABhXCVGSLGhWipZn2bBB/Scnur7YC5p02CK2tgacTajitQhuGI4PHPqiH1Ol8lyO9HRXj0jmEjAkURdQJdaxlCsK5Cz8enWj3J0c4DIfddURomupiofBwKBgBlG3ZnYYv/PQPa362NOoxq2gPh3hV7jQC36qReKJgvCMH0E/7zjVz7hFIpHP9lkAlZTpmOE4oOBDzEPS2k2k+gXKzvHqDwyFvPlV/+pF3CFkRu+H3LfXF4vUipXsH0PwS6d+xbHoP+P5PlqfccjcVRcQLe3B7Sty4Yl4CYRmJCpAoGBAL0uWJY7vpmVp1P2NmvbCLDLpo6aSTpTSfRKWtBS3Yk04+fpMxM/O0fUHpUH9TG4Wr6ue1z5cvOKP1gyxGRNm/JXFW3QGlWMGUYDV19RIM7xvAqj1Gnk3xb045ldO4qeZO+/lOP2wyDhuvkMI0JCX6aST3GGWgQ8BrIqrOP5T1R9AoGBALOhrwtuQZDi+udmRRlROMovMWukUsGnTPFyUZ58/Z0NxZHEPQRKoPsDJ7AbXPLGRj2PNyghnP5q7v8aPuBOFrmuHy1ciS5qKYYygRInWVpSEzUU+Zb0LPD74itPIZb/3S1mYMAki0Xxk4wFJebzp77Djn1ipvsu7V20FWg4Y1RS";
    //异步通知回调地址 一般用来验证本次支付操作是否成功  可进行成功后的一些业务逻辑
	//该地址必须为在域名机关进行备案的公网ip或者域名。
	public static String notify_url = "https://";
    //该地址为同步通知地址  一般用于支付完成给用户展示支付信息
	//域名同上要求
	public static String return_url = "https://";
    //支付宝支付网关
	public static String URL = "https://openapi.alipaydev.com/gateway.do";

	public static String CHARSET = "UTF-8";

	public static String FORMAT = "json";
    //支付宝公钥
	public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAjrEVFMOSiNJXaRNKicQuQdsREraftDA9Tua3WNZwcpeXeh8Wrt+V9JilLqSa7N7sVqwpvv8zWChgXhX/A96hEg97Oxe6GKUmzaZRNh0cZZ88vpkn5tlgL4mH/dhSr3Ip00kvM4rHq9PwuT4k7z1DpZAf1eghK8Q5BgxL88d0X07m9X96Ijd0yMkXArzD7jg+noqfbztEKoH3kPMRJC2w4ByVdweWUT2PwrlATpZZtYLmtDvUKG/sOkNAIKEMg3Rut1oKWpjyYanzDgS7Cg3awr1KPTl9rHCazk15aNYowmYtVabKwbGVToCAGK+qQ1gT3ELhkGnf3+h53fukNqRH+wIDAQAB";

	public static String log_path = "/log";

	public static String SIGNTYPE = "RSA2";
}
