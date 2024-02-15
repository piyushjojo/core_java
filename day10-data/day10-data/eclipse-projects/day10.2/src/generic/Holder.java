package generic;

//Create a Holder class , that can hold ANY data type (primitive/ref type)
public class Holder<T> {
	// state
	private T ref;

	public Holder(T ref) {
		super();
		this.ref = ref;
	}
	// getter

	public T getRef() {
		return ref;
	}

}
