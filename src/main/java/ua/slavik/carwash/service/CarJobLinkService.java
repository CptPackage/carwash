package ua.slavik.carwash.service;

import ua.slavik.carwash.model.CarJobLink;

public interface CarJobLinkService {
    CarJobLink getCarJobLinkById(Long id);

    CarJobLink createCarJobLink(CarJobLink carJobLink);
}
