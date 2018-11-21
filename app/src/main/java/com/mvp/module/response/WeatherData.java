package com.mvp.module.response;

import java.util.List;

/**
 * @author xiongxiang
 * @time 2018/11/13.
 * @e-mail 276186694@qq.com
 */
public class WeatherData {

    /**
     * code : 200
     * msg : 成功!
     * data : {"yesterday":{"date":"12日星期一","high":"高温 17℃","fx":"北风","low":"低温 12℃","fl":"<![CDATA[<3级]]>","type":"小雨"},"city":"杭州","aqi":"44","forecast":[{"date":"13日星期二","high":"高温 17℃","fengli":"<![CDATA[<3级]]>","low":"低温 10℃","fengxiang":"东北风","type":"多云"},{"date":"14日星期三","high":"高温 18℃","fengli":"<![CDATA[<3级]]>","low":"低温 11℃","fengxiang":"东风","type":"阴"},{"date":"15日星期四","high":"高温 19℃","fengli":"<![CDATA[<3级]]>","low":"低温 14℃","fengxiang":"东风","type":"小雨"},{"date":"16日星期五","high":"高温 18℃","fengli":"<![CDATA[3-4级]]>","low":"低温 14℃","fengxiang":"北风","type":"小雨"},{"date":"17日星期六","high":"高温 17℃","fengli":"<![CDATA[3-4级]]>","low":"低温 12℃","fengxiang":"北风","type":"小雨"}],"ganmao":"昼夜温差较大，较易发生感冒，请适当增减衣服。体质较弱的朋友请注意防护。","wendu":"15"}
     */

    private int code;
    private String msg;
    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * yesterday : {"date":"12日星期一","high":"高温 17℃","fx":"北风","low":"低温 12℃","fl":"<![CDATA[<3级]]>","type":"小雨"}
         * city : 杭州
         * aqi : 44
         * forecast : [{"date":"13日星期二","high":"高温 17℃","fengli":"<![CDATA[<3级]]>","low":"低温 10℃","fengxiang":"东北风","type":"多云"},{"date":"14日星期三","high":"高温 18℃","fengli":"<![CDATA[<3级]]>","low":"低温 11℃","fengxiang":"东风","type":"阴"},{"date":"15日星期四","high":"高温 19℃","fengli":"<![CDATA[<3级]]>","low":"低温 14℃","fengxiang":"东风","type":"小雨"},{"date":"16日星期五","high":"高温 18℃","fengli":"<![CDATA[3-4级]]>","low":"低温 14℃","fengxiang":"北风","type":"小雨"},{"date":"17日星期六","high":"高温 17℃","fengli":"<![CDATA[3-4级]]>","low":"低温 12℃","fengxiang":"北风","type":"小雨"}]
         * ganmao : 昼夜温差较大，较易发生感冒，请适当增减衣服。体质较弱的朋友请注意防护。
         * wendu : 15
         */

        private YesterdayBean yesterday;
        private String city;
        private String aqi;
        private String ganmao;
        private String wendu;
        private List<ForecastBean> forecast;

        public YesterdayBean getYesterday() {
            return yesterday;
        }

        public void setYesterday(YesterdayBean yesterday) {
            this.yesterday = yesterday;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getAqi() {
            return aqi;
        }

        public void setAqi(String aqi) {
            this.aqi = aqi;
        }

        public String getGanmao() {
            return ganmao;
        }

        public void setGanmao(String ganmao) {
            this.ganmao = ganmao;
        }

        public String getWendu() {
            return wendu;
        }

        public void setWendu(String wendu) {
            this.wendu = wendu;
        }

        public List<ForecastBean> getForecast() {
            return forecast;
        }

        public void setForecast(List<ForecastBean> forecast) {
            this.forecast = forecast;
        }

        public static class YesterdayBean {
            /**
             * date : 12日星期一
             * high : 高温 17℃
             * fx : 北风
             * low : 低温 12℃
             * fl : <![CDATA[<3级]]>
             * type : 小雨
             */

            private String date;
            private String high;
            private String fx;
            private String low;
            private String fl;
            private String type;

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getHigh() {
                return high;
            }

            public void setHigh(String high) {
                this.high = high;
            }

            public String getFx() {
                return fx;
            }

            public void setFx(String fx) {
                this.fx = fx;
            }

            public String getLow() {
                return low;
            }

            public void setLow(String low) {
                this.low = low;
            }

            public String getFl() {
                return fl;
            }

            public void setFl(String fl) {
                this.fl = fl;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class ForecastBean {
            /**
             * date : 13日星期二
             * high : 高温 17℃
             * fengli : <![CDATA[<3级]]>
             * low : 低温 10℃
             * fengxiang : 东北风
             * type : 多云
             */

            private String date;
            private String high;
            private String fengli;
            private String low;
            private String fengxiang;
            private String type;

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getHigh() {
                return high;
            }

            public void setHigh(String high) {
                this.high = high;
            }

            public String getFengli() {
                return fengli;
            }

            public void setFengli(String fengli) {
                this.fengli = fengli;
            }

            public String getLow() {
                return low;
            }

            public void setLow(String low) {
                this.low = low;
            }

            public String getFengxiang() {
                return fengxiang;
            }

            public void setFengxiang(String fengxiang) {
                this.fengxiang = fengxiang;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }
    }
}
