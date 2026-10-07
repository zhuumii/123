package com.zhumi.variable;

public class VariableDome2 {
    public static void main(String[] args) {
//        我方:叉子 对方:长手
//        攻击:220 攻击:210
//        防御:85 防御:80
//        血量:1012.5 血量:1223.3
//        技能加成: 1.2 技能加成:1.3

//        技能造成伤害的公式:攻击力*技能加成-对方防御力
//        普攻造成伤害的公式:攻击力- 对方防御力

//        我方第一次进行普通攻击，造成多少伤害，对方还剩余多少血量?
//        我方第二次进行技能攻击，造成多少伤害，对方还剩余多少血量?

        //经常发生改变的数据要用变量储存

        //1.定义变量记录我方的血量
            double Blood1 = 1012.5;
        //2.定义变量记录对方的血量
            double Blood2 = 1223.3;
        //3.定义变量记录我方的攻击力
            double Attack1 = 220;
        //4.定义变量记录敌方的攻击力
            double Attack2 = 210;
        //5.定义变量记录我方的防御力
            double Defense1 = 85;
        //6.定义变量记录对方的防御力
            double Defense2 = 80;
        //7.定义变量记录我方的技能加成
            double Skill1 = 1.2;
        //8.定义变量记录对方的技能加成
            double Skill2 = 1.3;
        //9.我方第一次进行普通攻击，造成多少伤害，对方还剩余多少血量?
        //普攻造成伤害的公式:攻击力- 对方防御力
        double damage1 = Attack1 - Defense2;
        Blood2 -= damage1; //对方还剩余多少血量
        System.out.println(Blood2);//1083.3
        //10.我方第二次进行技能攻击，造成多少伤害，对方还剩余多少血量?
        //技能造成伤害的公式:攻击力*技能加成-对方防御力
        double damage2 = Attack1 * Skill1 - Defense2;
        Blood2 -= damage2;//对方还剩余多少血量
        System.out.println(Blood2);//893.3
    }
}
