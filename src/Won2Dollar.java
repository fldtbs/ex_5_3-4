
public class Won2Dollar extends Converter{
	
	public Won2Dollar (double ratio) {
		this.ratio = ratio;//외부에서 객체 생성될 때 인수로 들어온 값으로 ratio를 초기화
	}

	@Override
	protected double convert(double src) {
		// TODO Auto-generated method stub
		return src/ratio;
	}

	@Override
	protected String getSrcString() {
		// TODO Auto-generated method stub
		return "원";
	}

	@Override
	protected String getDestString() {
		// TODO Auto-generated method stub
		return "달러";
	}
	
}
