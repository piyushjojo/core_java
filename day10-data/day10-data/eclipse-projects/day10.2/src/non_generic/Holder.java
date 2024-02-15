package non_generic;

//Create a Holder class , that can hold ANY data type (primitive/ref type)
public class Holder {
	// state
	private Object ref;

	public Holder(Object ref) {
		super();
		this.ref = ref;
	}
	// getter

	public Object getRef() {
		return ref;
	}

}
