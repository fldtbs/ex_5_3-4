
public class Won2Dollar extends Converter{
	
	public Won2Dollar (double ratio) {
		this.ratio = ratio;//�ܺο��� ��ü ������ �� �μ��� ���� ������ ratio�� �ʱ�ȭ
	}

	@Override
	protected double convert(double src) {
		// TODO Auto-generated method stub
		return src/ratio;
	}

	@Override
	protected String getSrcString() {
		// TODO Auto-generated method stub
		return "��";
	}

	@Override
	protected String getDestString() {
		// TODO Auto-generated method stub
		return "�޷�";
	}
	
}
