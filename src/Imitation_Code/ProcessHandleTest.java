package Imitation_Code;

import java.util.concurrent.CompletableFuture;
public class ProcessHandleTest{
	public static void main(String[] args) throws Exception, InterruptedException{
		Runtime rt = Runtime.getRuntime();
		//���м��±�����
		Process p = rt.exec("notepad.exe");
		ProcessHandle ph = p.toHandle();
		System.out.println("�����Ƿ����У�" + ph.isAlive());
		System.out.println("����ID��" + ph.pid());
		System.out.println("�����̣�" +ph.parent());
		//��ȡProcessHandle.Info��Ϣ
		ProcessHandle.Info info = ph.info();
		//ͨ��ProcessHandle.Info��Ϣ��ȡ���������Ϣ
		System.out.println("�������" + info.command());
		System.out.println("���̲�����" + info.arguments());
		System.out.println("��������ʱ�䣺" + info.startInstant());
		System.out.println("�����ۼ�����ʱ�䣺" + info.totalCpuDuration());
		//ͨ��CompletableFuture�ڽ������н���ʱ����ĳ������
		CompletableFuture<ProcessHandle> cf = ph.onExit();
		cf.thenRunAsync(()->{
			System.out.println("�����˳�");
		});
		Thread.sleep(5000);
	}
}