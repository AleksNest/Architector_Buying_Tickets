package Interfaces;

import Models.Carrier;

/**
 * ��������� �������������� � ����� ������������
 */
public interface ICarrierRepo {
    /**
     * �������� ������ ����������� �� ���� �� ID
     *
     * @param id ������������� ����������� � ����
     * @return
     */
    Carrier read(int id);
}
