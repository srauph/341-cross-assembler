public interface IErrorReporter {
	
	//Records Error detected at a specific position
	void record(ErrorMsg error);

	//Reports all errors
	void report();

}