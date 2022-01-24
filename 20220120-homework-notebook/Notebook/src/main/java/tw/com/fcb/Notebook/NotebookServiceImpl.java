package tw.com.fcb.Notebook;

import java.util.ArrayList;
import java.util.List;

public class NotebookServiceImpl implements NotebookService {

	List<NoteBook> myNotebook = new ArrayList<>();

	public NotebookServiceImpl(List<NoteBook> myNotebook) {
		this.myNotebook = myNotebook;
	}


	@Override
	public String toString() {
		return "NotebookServiceImpl [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}




	@Override
	public List<NoteBook> getByBrand(String brand) {
		List<NoteBook> brandResult = new ArrayList<NoteBook>();
		for (int i = 0; i < myNotebook.size(); i++) {
			NoteBook thisBrand = myNotebook.get(i);
			int count = -1;
			if (thisBrand.getBrand().equals(brand)) {
				count ++;
				brandResult.add(thisBrand);

			} else {
				if (count == 0) {
					System.out.println("No Result Found !");
				}
			}
		}
		return brandResult;
	}

	@Override
	public List<NoteBook> getByCPU(String cpu) {
		List<NoteBook> cpuResult = new ArrayList<NoteBook>();
		for (int i = 0; i < myNotebook.size(); i++) {
			NoteBook thisCPU = myNotebook.get(i);
			int count = -1;
			if (thisCPU.getCpu().equals(cpu)) {
				count++;
				cpuResult.add(thisCPU);

			} else {
				if (count == 0) {
					System.out.println("No Result Found !");
				}
			}
		}
		return cpuResult;
	}

	@Override
	public List<NoteBook> getByColor(String color) {
		List<NoteBook> colorResult = new ArrayList<NoteBook>();
		for (int i = 0; i < myNotebook.size() ; i++) {
			NoteBook thisColor = myNotebook.get(i);
			int count = -1;
			if (thisColor.getColor().equals(color)) {
				count ++;
				colorResult.add(thisColor);

			} else {
				if (count == 0) {
					System.out.println("No Result Found !");
				}
			}

		}
		return colorResult;
	}

	public List<NoteBook> getByScreenSize(String screenSize) {
		List<NoteBook> screenSizeResult = new ArrayList<NoteBook>();
		for (int i = 0; i < myNotebook.size(); i++) {
			NoteBook thisScreenSize = myNotebook.get(i);
			int count = -1;
			if (thisScreenSize.getScreenSize().equals(screenSize)) {
				count ++;
				screenSizeResult.add(thisScreenSize);

			} else {
				if (count == 0) {
					System.out.println("No Result Found !");
				}
			}
		}

		return screenSizeResult;
	}
//
	@Override
	public List<NoteBook> getAllproduct() {
		for (int i = 0; i < myNotebook.size(); i++) {
			NoteBook content = myNotebook.get(i);
			System.out.println("data = " + content);
		}
		return  myNotebook;
	}
}