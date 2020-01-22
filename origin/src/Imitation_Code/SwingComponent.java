package Imitation_Code;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SwingComponent {
    JFrame f = new JFrame("���Դ���");
    
    //����һ����ť����Ϊָ֮��ͼ��
    Icon okIcon = new ImageIcon("C:\\Users\\yk\\eclipse-workspace\\���Java����\\ico\\ok.png");
    JButton ok = new JButton("ȷ��", okIcon);
    
    //����һ����ѡ��ť����ʼ����ѡ��״̬
    JRadioButton male = new JRadioButton("��", true);
    
    //����һ����ѡ��ť����ʼ����û��ѡ��״̬
    JRadioButton female = new JRadioButton("Ů", false);
    
    //����һ��ButtonGroup�����ڽ���������JRadioButton�����һ��
    ButtonGroup bg = new ButtonGroup();
    
    //����һ����ѡ�򣬳�ʼ����û��ѡ��״̬
    JCheckBox married = new JCheckBox("�Ƿ��ѻ飿", false);
    
    String[] colors = new String[] {"��ɫ", "��ɫ", "��ɫ"};
    
    //����һ������ѡ����
    JComboBox<String> colorChooser = new JComboBox<>(colors);
    
    //����һ���б�ѡ���
    JList<String> colorList = new JList<>(colors);
    
    //����һ��8�С�20�еĶ����ı���
    JTextArea ta = new JTextArea(8, 20);
    
    //����һ��40�еĵ����ı���
    JTextField name = new JTextField(40);
    
    JMenuBar mb = new JMenuBar();
    
    JMenu file = new JMenu("�ļ�");
    JMenu edit = new JMenu("�༭");
    
    //�������½����˵����Ϊָ֮��ͼ��
    Icon newIcon = new ImageIcon("C:\\Users\\yk\\eclipse-workspace\\���Java����\\ico\\new.png");  
    JMenuItem newItem = new JMenuItem("�½�", newIcon);
    
    //���������桱�˵����Ϊָ֮��ͼ��
    Icon saveIcon = new ImageIcon("C:\\Users\\yk\\eclipse-workspace\\���Java����\\ico\\save.png");  
    JMenuItem saveItem = new JMenuItem("����", saveIcon);
    
    //�������˳����˵����Ϊָ֮��ͼ��
    Icon exitIcon = new ImageIcon("C:\\Users\\yk\\eclipse-workspace\\���Java����\\ico\\exit.png");    
    JMenuItem exitItem = new JMenuItem("�˳�", exitIcon);
    
    JCheckBoxMenuItem autoWrap = new JCheckBoxMenuItem("�Զ�����");
    
    //���������ơ��˵����Ϊָ֮��ͼ��
    Icon copyIcon = new ImageIcon("C:\\Users\\yk\\eclipse-workspace\\���Java����\\ico\\copy.png");
    JMenuItem copyItem = new JMenuItem("����", copyIcon);
    
    //������ճ�����˵����Ϊָ֮��ͼ��
    Icon pasteIcon = new ImageIcon("C:\\Users\\yk\\eclipse-workspace\\���Java����\\ico\\paste.png");
    JMenuItem pasteItem = new JMenuItem("ճ��", pasteIcon);
    
    JMenu format = new JMenu("��ʽ");
    JMenuItem commentItem = new JMenuItem("ע��");
    JMenuItem cancelItem = new JMenuItem("ȡ��ע��");
    
    //����һ���Ҽ��˵��������ó�����
    JPopupMenu pop = new JPopupMenu();
    
    //��������������˵����ButtonGroup
    ButtonGroup flavorGroup = new ButtonGroup();
    
    //���������ѡ��ť�������趨�������۷��
    JRadioButtonMenuItem metalItem = new JRadioButtonMenuItem("Metal���", true);
    JRadioButtonMenuItem nimbusItem = new JRadioButtonMenuItem("Nimbus���");
    JRadioButtonMenuItem windowsItem = new JRadioButtonMenuItem("Windows���");
    JRadioButtonMenuItem classicItem = new JRadioButtonMenuItem("Windows������");
    JRadioButtonMenuItem motifItem = new JRadioButtonMenuItem("Motif���");
    
    //------------------------------����ִ�н����ʼ����init����------------------------------
    
    public void init() {
        //����һ��װ�����ı��򡢰�ť��JPanel
        JPanel bottom = new JPanel();
        
        bottom.add(name);
        bottom.add(ok);
        
        f.add(bottom, BorderLayout.SOUTH);
        
        //������һ��װ��������ѡ�������JCheckBox��JPanel
        JPanel checkPanel = new JPanel();
        
        checkPanel.add(colorChooser);
        
        bg.add(male);
        bg.add(female);
        
        checkPanel.add(male);
        checkPanel.add(female);
        checkPanel.add(married);
        
        //����һ����ֱ���������Box��ʢװ�����ı���JPanel
        Box topLeft = Box.createVerticalBox();
        
        //ʹ��JScrollPane��Ϊ��ͨ�����JViewPort
        JScrollPane taJsp = new JScrollPane(ta);
        
        topLeft.add(taJsp);
        topLeft.add(checkPanel);
        
        //����һ��ˮƽ���е����Box��ʢװtopLeft��colorList
        Box top = Box.createHorizontalBox();
        
        top.add(topLeft);
        top.add(colorList);
        
        //�� top Box�������ӵ����ڵ��м�
        f.add(top);
        
        //---------------���濪ʼ��ϲ˵�����Ϊ�˵������¼�������---------------
        
        //ΪnewItem���ÿ�ݼ������ÿ�ݼ�ʱҪע��ʹ�ô�д��ĸ
        newItem.setAccelerator(KeyStroke.getKeyStroke('N', InputEvent.CTRL_MASK));
        newItem.addActionListener(e -> ta.append("�û������ˡ��½����˵�\n"));
        
        //Ϊfile�˵����Ӳ˵���
        file.add(newItem);
        file.add(saveItem);
        file.add(exitItem);
        
        //Ϊedit�˵����Ӳ˵���
        edit.add(autoWrap);
        
        //ʹ��addSeparator�������Ӳ˵��ָ���
        edit.addSeparator();
        edit.add(copyItem);
        edit.add(pasteItem);
        
        //ΪcommentItem���������ʾ��Ϣ
        commentItem.setToolTipText("���������ע��������");
        
        //Ϊformat�˵����Ӳ˵���
        format.add(commentItem);
        format.add(cancelItem);
        
        //ʹ������new JMenuItem("-")�ķ�ʽ�������Ӳ˵��ָ���
        edit.add(new JMenuItem("-"));
        
        //��format�˵����ӵ�edit�˵��У��Ӷ��γɶ����˵�
        edit.add(format);
        
        //��file��edit�˵����ӵ�mb�˵�����
        mb.add(file);
        mb.add(edit);
        
        //Ϊf�������ò˵���
        f.setJMenuBar(mb);
        
        //---------------���濪ʼ����Ҽ��˵�������װ�Ҽ��˵�---------------
        
        flavorGroup.add(metalItem);
        flavorGroup.add(nimbusItem);
        flavorGroup.add(windowsItem);
        flavorGroup.add(classicItem);
        flavorGroup.add(motifItem);
        
        pop.add(metalItem);
        pop.add(nimbusItem);
        pop.add(windowsItem);
        pop.add(classicItem);
        pop.add(motifItem);
        
        //Ϊ������˵���װ�¼�������
        ActionListener flavorListener = e -> {
            try {
                switch (e.getActionCommand()) {
                    case "Metal���":
                        changeFlavor(1);
                        break;
                    case "Nimbus���":
                        changeFlavor(2);
                        break;
                    case "Windows���":
                        changeFlavor(31);
                        break;
                    case "Windows������":
                        changeFlavor(4);
                        break;
                    case "Motif���":
                        changeFlavor(5);
                        break;
                }
            } catch (Exception ee) {
                    ee.printStackTrace();
            }
        };
        
        //Ϊ5�����˵��������¼�������
        metalItem.addActionListener(flavorListener);
        nimbusItem.addActionListener(flavorListener);
        windowsItem.addActionListener(flavorListener);
        classicItem.addActionListener(flavorListener);
        motifItem.addActionListener(flavorListener);
        
        //���ø÷������������Ҽ��˵�������ʹ���¼�����
        ta.setComponentPopupMenu(pop);
        
        //���ùرմ���ʱ���˳�����
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);
    }
    
    //����һ�����������ڸı������
    public void changeFlavor(int flavor) throws Exception {
        switch (flavor) {
            //����Metal���
            case 1:
                UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
                break;
            //����Metal���
            case 2:
                UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
                break;
            //����Metal���
            case 3:
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                break;
            //����Metal���
            case 4:
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
                break;
            //����Metal���
            case 5:
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.MotifLookAndFeel");
                break;
        }
        
        //����f�����ڶ��������Լ��ڲ��������UI
        SwingUtilities.updateComponentTreeUI(f.getContentPane());
        
        //����mb�˵����Լ��ڲ��������UI
        SwingUtilities.updateComponentTreeUI(mb);
        
        //����pop�Ҽ��˵��Լ��ڲ��������UI
        SwingUtilities.updateComponentTreeUI(pop);
    }
    
    public static void main(String[] args) {
        //����Swing����ʹ��Java���
        //JFrame.setDefaultLookAndFeelDecorated(true);
        new SwingComponent().init();
    }
}