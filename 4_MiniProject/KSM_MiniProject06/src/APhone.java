public class APhone implements IFuntion{
	public void phoneName() {
		System.out.println("APhone");
		}
	@Override
	public void phoneCall() {
		System.out.printf("전화 %s 합니다\n", CALL);
		}
	@Override
	public void accessSpeed() {
		System.out.printf("불가능합니다 %s 입니다\n", ACCESSSPEEDTHREE);
		}
	@Override
	public void tvRemote() {
		System.out.printf("%s 되어있습니다\n", TVREMOTENO);
		}
}
