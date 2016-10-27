package helloworld.lifeline.dao;

public interface IUserDao<U> extends IDao<U> {

	U getByEmail(String email);

}
