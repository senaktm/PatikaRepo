package RepositoryLayer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import EntityLayer.Entities.House;
import EntityLayer.Entities.Structure;
import EntityLayer.Entities.Summerhouse;
import EntityLayer.Entities.Villa;
import EntityLayer.Enum.StructureType;

public class StructureRepository {
	
    private List<Structure> structureList = new ArrayList<>();

    public StructureRepository() {
        // House Örnekleri
        structureList.add(new House(300000, 120, 3, 1));
        structureList.add(new House(350000, 150, 4, 1));
        structureList.add(new House(280000, 110, 3, 1));
        
        // Villa Örnekleri
        structureList.add(new Villa(700000, 250, 5, 2));
        structureList.add(new Villa(850000, 300, 6, 2));
        structureList.add(new Villa(900000, 320, 7, 3));
        
        // Summerhouse Örnekleri
        structureList.add(new Summerhouse(400000, 180, 4, 1));
        structureList.add(new Summerhouse(450000, 200, 5, 2));
        structureList.add(new Summerhouse(420000, 190, 4, 1));
    }

    public List<Structure> getStructureList() {
        return structureList;
    }

    public List<Structure> getStructureByType(StructureType type) {
        return structureList.stream()
                .filter(structure -> structure.getType() == type)
                .collect(Collectors.toList());
    }
}