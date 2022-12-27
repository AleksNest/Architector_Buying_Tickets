package Interfaces;

import Models.Ticket;

import java.util.List;

/**
 * ��������� �������������� � ����� �������
 */
public interface ITicketRepo {
    /**
     * ������� ����� �����
     *
     * @param ticket
     * @return
     */
    boolean create(Ticket ticket);

    /**
     * �������� ������ ������� �� ������ ��������
     *
     * @param routeNumber
     * @return
     */
    List<Ticket> readAll(int routeNumber);

    /**
     * �������� �����
     *
     * @param ticket
     * @return
     */
    boolean update(Ticket ticket);

    /**
     * ������� �����
     *
     * @param ticket
     * @return
     */
    boolean delete(Ticket ticket);
}
