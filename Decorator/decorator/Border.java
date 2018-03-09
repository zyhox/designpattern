package decorator;
/**
 * 装饰类的抽象类,为保持一致性，继承公共接口display
 * 维护被装饰类的对象实例
 * @author jack
 *
 */
public abstract class Border extends Display{
	protected Display display;//表示被装饰物
	protected Border(Display display){//在生成实例时通过参数指定被装饰物
		this.display = display;
	}
}
