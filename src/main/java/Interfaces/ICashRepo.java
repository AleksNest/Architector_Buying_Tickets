package Interfaces;

/**
 * ��������� �������������� � ����� ���������� ��������
 */
public interface ICashRepo {
    /**
     * ����� ���������� ����������
     *
     * @param payment  ������
     * @param cardFrom ����� ����������
     * @param cardTo   ����� ��������
     * @return ��������� ���������� ��������
     */
    boolean transaction(int payment, long cardFrom, long cardTo);
}
