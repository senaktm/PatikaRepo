package Main;

import EntityLayer.Enum.StructureType;
import RepositoryLayer.StructureRepository;
import ServiceLayer.StructureService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        StructureService structureService = new StructureService(new StructureRepository());

        System.out.println("Evlerin toplam fiyati: " + structureService.getTotalPrice(structureService.getStructuresByType(StructureType.House)));
        System.out.println("Villalarin toplam fiyati: " + structureService.getTotalPrice(structureService.getStructuresByType(StructureType.Villa)));
        System.out.println("Yazliklarin toplam fiyati: " + structureService.getTotalPrice(structureService.getStructuresByType(StructureType.Summerhouse)));
        System.out.println("Tum tipteki yapilarin toplam fiyati: " + structureService.getTotalPriceOfAllStructures());

        System.out.println("Evlerin ortalama metrekaresi: " + structureService.getAverageSquareMeter(structureService.getStructuresByType(StructureType.House)));
        System.out.println("Villalarin ortalama metrekaresi: " + structureService.getAverageSquareMeter(structureService.getStructuresByType(StructureType.Villa)));
        System.out.println("Yazliklarin ortalama metrekaresi: " + structureService.getAverageSquareMeter(structureService.getStructuresByType(StructureType.Summerhouse)));
        System.out.println("Tum tipteki yapilarin ortalama metrekaresi: " + structureService.getAverageSquareMeterOfAllStructures());

        System.out.println("3 oda ve 1 salon olan yapılar: " + structureService.filterStructuresByRoomsAndLivingRooms(3, 1));
		
	}

}
