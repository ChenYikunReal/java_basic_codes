package Imitation_Code;

import javax.swing.*;

public class AllLookAndFeel
{
    public static void main(String[] args)
    {
        System.out.println("��ǰϵͳ���õ�����LAF:");
        for (UIManager.LookAndFeelInfo info :
            UIManager.getInstalledLookAndFeels())
        {
            System.out.println(info.getName()
                + "--->" + info);
        }
    }
}
