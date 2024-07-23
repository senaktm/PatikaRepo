package ServiceLayer;

import java.util.List;

import EntityLayer.Entities.Structure;
import EntityLayer.Enum.StructureType;
import RepositoryLayer.StructureRepository;

public class StructureService {


	private final StructureRepository structureRepository;

   
    public StructureService(StructureRepository structureRepository) {
        this.structureRepository = structureRepository;
    }

    public double getTotalPrice(List<? extends Structure> structures) {
        return structures.stream().mapToDouble(Structure::getPrice).sum();
    }

    public double getAverageSquareMeter(List<? extends Structure> structures) {
        return structures.stream().mapToDouble(Structure::getSquareMeter).average().orElse(0);
    }

    public double getTotalPriceOfAllStructures() {
        return getTotalPrice(structureRepository.getStructureList());
    }

    public double getAverageSquareMeterOfAllStructures() {
        return getAverageSquareMeter(structureRepository.getStructureList());
    }

    public List<Structure> filterStructuresByRoomsAndLivingRooms(int rooms, int livingRooms) {
        return structureRepository.getStructureList().stream()
                .filter(s -> s.getRooms() == rooms && s.getLivingRooms() == livingRooms)
                .toList();
    }

    public List<Structure> getStructuresByType(StructureType type) {
        return structureRepository.getStructureByType(type);
    }
}
