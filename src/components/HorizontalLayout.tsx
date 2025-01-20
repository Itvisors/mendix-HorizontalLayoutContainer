import { ReactElement, createElement } from "react";
import { ObjectItem } from "mendix";
import { ContentListType } from "typings/HorizontalLayoutContainerProps";


export interface HorizontalLayoutProps {
    dsItems: ObjectItem[];
    contentList: ContentListType[];
    widgetName: string;
    widgetClass: string;
}

export function HorizontalLayout(props: HorizontalLayoutProps): ReactElement {
    const { dsItems, contentList, widgetName, widgetClass } = props;
    let className = widgetName + " horizontal-layout-container-main";
    if (widgetClass) {
        className += " " + widgetClass;
    }
    return (<div className={className}>
        {contentList.map((contentItem, contentIndex) => (
            <div key={`content${contentIndex}`} className={`horizontal-layout-container-row row-${contentIndex}` }>
                {dsItems.map((item, index) => (
                    <div key={item.id} className={`horizontal-layout-container-item item-${index}`}>
                        {contentItem.content.get(item)}
                    </div>
                ))}
            </div>
        ))}
    </div>);
}
