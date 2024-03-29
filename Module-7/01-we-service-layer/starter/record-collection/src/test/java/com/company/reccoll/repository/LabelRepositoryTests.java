package com.company.reccoll.repository;

import com.company.reccoll.model.Label;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


@SpringBootTest
public class LabelRepositoryTests {

    @Autowired
    TrackRepository trackRepository;
    @Autowired
    AlbumRepository albumRepository;
    @Autowired
    ArtistRepository artistRepository;
    @Autowired
    LabelRepository labelRepository;

    @BeforeEach
    public void setUp() throws Exception {
        trackRepository.deleteAll();
        albumRepository.deleteAll();
        artistRepository.deleteAll();
        labelRepository.deleteAll();
    }

    @Test
    public void shouldAddLabel() {

        //Arrange...
        Label label = new Label();
        label.setName("Intesrcope");
        label.setWebsite("www.intersope.com");

        labelRepository.save(label);

        //Act...
        Optional<Label> label1 = labelRepository.findById(label.getId());

        //Assert...
        assertEquals(label1.get(), label);
    }

    @Test
    public void shouldGetLabelById() {

        //Arrange...
        Label label = new Label();
        label.setName("Intesrcope");
        label.setWebsite("www.intersope.com");
        labelRepository.save(label);

        Label label2 = new Label();
        label2.setName("A&M");
        label2.setWebsite("www.aandm.com");
        labelRepository.save(label2);

        //Act...
        Optional<Label> foundLabel = labelRepository.findById(label.getId());

        //Assert...
        assertEquals(foundLabel.get(), label);
    }

    @Test
    public void shouldGetAllLabels() {

        //Arrange...
        Label label = new Label();
        label.setName("Intesrcope");
        label.setWebsite("www.intersope.com");
        labelRepository.save(label);

        label = new Label();
        label.setName("Island");
        label.setWebsite("www.island.com");
        labelRepository.save(label);

        //Act...
        List<Label> lList = labelRepository.findAll();

        //Assert...
        assertEquals(lList.size(), 2);
    }

    @Test
    public void shouldUpdateLabel() {

        //Arrange...
        Label label = new Label();
        label.setName("Intesrcope");
        label.setWebsite("www.intersope.com");
        labelRepository.save(label);

        //Act...
        label.setName("NEW NAME");
        label.setWebsite("NEW WEBSITE");
        labelRepository.save(label);

        Optional<Label> label1 = labelRepository.findById(label.getId());

        //Assert...
        assertEquals(label1.get(), label);
    }

    @Test
    public void shouldDeleteLabelById() {

        //Arrange...
        Label label = new Label();
        label.setName("Intesrcope");
        label.setWebsite("www.intersope.com");

        labelRepository.save(label);

        Optional<Label> label1 = labelRepository.findById(label.getId());

        assertEquals(label1.get(), label);

        //Act...
        labelRepository.deleteById(label.getId());

        label1 = labelRepository.findById(label.getId());

        //Assert...
        assertFalse(label1.isPresent());
    }
}