package com.leon.weixin.util;

import java.io.UnsupportedEncodingException;

import sun.security.action.GetBooleanAction;

import com.leon.weixin.entity.AccessToken;
import com.leon.weixin.entity.Button;
import com.leon.weixin.entity.CommonButton;
import com.leon.weixin.entity.ComplexButton;
import com.leon.weixin.entity.Menu;

public class MenuManager {
	public static void main(String[] args) throws UnsupportedEncodingException {  
//        // �������û�Ψһƾ֤  
//        String appId = "wx5cf3ee7b60c9b903";  
//        // �������û�Ψһƾ֤��Կ  
//        String appSecret = "9886b62afa6ac97d1f4608ee93419e81";  
//  
//        // ���ýӿڻ�ȡaccess_token  
//        AccessToken at = WeixinUtil.getAccessToken(appId, appSecret);  
//  
//        if (null != at) {  
//            // ���ýӿڴ����˵�  
//            int result = WeixinUtil.createMenu(getMenu(), at.getToken());  
//  
//            // �жϲ˵��������  
//            if (0 == result) { 
//                //log.info("�˵������ɹ���");
//            }else { 
//            	System.out.println("�˵�����ʧ�ܣ������룺"+result);
//                //log.info("�˵�����ʧ�ܣ������룺" + result); 
//            }
//        }  
		
		WeixinUtil.getRespText(new String("�ؼ�".getBytes("UTF-8")));
    }  
  
    /** 
     * ��װ�˵����� 
     *  
     * @return 
     */  
    private static Menu getMenu() {  
        CommonButton btn11 = new CommonButton();  
        btn11.setName("����Ԥ��");  
        btn11.setType("click");  
        btn11.setKey("11");  
  
        CommonButton btn12 = new CommonButton();  
        btn12.setName("������ѯ");  
        btn12.setType("click");  
        btn12.setKey("12");  
  
        CommonButton btn13 = new CommonButton();  
        btn13.setName("�ܱ�����");  
        btn13.setType("click");  
        btn13.setKey("13");  
  
        CommonButton btn14 = new CommonButton();  
        btn14.setName("��ʷ�ϵĽ���");  
        btn14.setType("click");  
        btn14.setKey("14");  
  
        CommonButton btn21 = new CommonButton();  
        btn21.setName("�����㲥");  
        btn21.setType("click");  
        btn21.setKey("21");  
  
        CommonButton btn22 = new CommonButton();  
        btn22.setName("������Ϸ");  
        btn22.setType("click");  
        btn22.setKey("22");  
  
        CommonButton btn23 = new CommonButton();  
        btn23.setName("��Ů��̨");  
        btn23.setType("click");  
        btn23.setKey("23");  
  
        CommonButton btn24 = new CommonButton();  
        btn24.setName("����ʶ��");  
        btn24.setType("click");  
        btn24.setKey("24");  
  
        CommonButton btn25 = new CommonButton();  
        btn25.setName("�������");  
        btn25.setType("click");  
        btn25.setKey("25");  
  
        CommonButton btn31 = new CommonButton();  
        btn31.setName("Q��Ȧ");  
        btn31.setType("click");  
        btn31.setKey("31");  
  
        CommonButton btn32 = new CommonButton();  
        btn32.setName("��Ӱ���а�");  
        btn32.setType("click");  
        btn32.setKey("32");  
  
        CommonButton btn33 = new CommonButton();  
        btn33.setName("��ĬЦ��");  
        btn33.setType("click");  
        btn33.setKey("33");  
  
        ComplexButton mainBtn1 = new ComplexButton();  
        mainBtn1.setName("��������");  
        mainBtn1.setSub_button(new CommonButton[] { btn11, btn12, btn13, btn14 });  
  
        ComplexButton mainBtn2 = new ComplexButton();  
        mainBtn2.setName("������վ");  
        mainBtn2.setSub_button(new CommonButton[] { btn21, btn22, btn23, btn24, btn25 });  
  
        ComplexButton mainBtn3 = new ComplexButton();  
        mainBtn3.setName("��������");  
        mainBtn3.setSub_button(new CommonButton[] { btn31, btn32, btn33 });  
  
        /** 
         * ���ǹ��ں�xiaoqrobotĿǰ�Ĳ˵��ṹ��ÿ��һ���˵����ж����˵���<br> 
         *  
         * ��ĳ��һ���˵���û�ж����˵��������menu����ζ����أ�<br> 
         * ���磬������һ���˵���ǡ��������顱����ֱ���ǡ���ĬЦ��������ômenuӦ���������壺<br> 
         * menu.setButton(new Button[] { mainBtn1, mainBtn2, btn33 }); 
         */  
        Menu menu = new Menu();  
        menu.setButton(new Button[] { mainBtn1, mainBtn2, mainBtn3 });  
  
        return menu;  
    }  

}
