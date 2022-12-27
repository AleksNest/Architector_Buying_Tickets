package Interfaces;

import Models.User;

import java.util.List;

/**
 * ��������� �������������� � ����� ��������
 */
public interface IUserRepo {
    /**
     * ������� ������ ������������
     *
     * @param userName
     * @param passwordHash
     * @param cardNumber
     * @return
     */
    int create(String userName, int passwordHash, long cardNumber);

    /**
     * �������� ������������ �� ID (��� ������, � ���������� �� ������������)
     *
     * @param id
     * @return
     */
    User read(int id);

    /**
     * �������� ������������ �� �����
     *
     * @param userName
     * @return
     */
    User read(String userName);

    /**
     * �������� ������ ������������� (��� ������, � ���������� �� ������������)
     *
     * @return
     */
    List<User> readAll();

    /**
     * �������� ������������ (��� ������, � ���������� �� ������������)
     *
     * @param client
     * @return
     */
    boolean update(User client);

    /**
     * ������� ������������ (��� ������, � ���������� �� ������������)
     *
     * @param client
     * @return
     */
    boolean delete(User client);
}
