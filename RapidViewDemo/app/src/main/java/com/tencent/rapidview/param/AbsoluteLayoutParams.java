/***************************************************************************************************
 Tencent is pleased to support the open source community by making RapidView available.
 Copyright (C) 2017 THL A29 Limited, a Tencent company. All rights reserved.
 Licensed under the MITLicense (the "License"); you may not use this file except in compliance
 withthe License. You mayobtain a copy of the License at

 http://opensource.org/licenses/MIT

 Unless required by applicable law or agreed to in writing, software distributed under the License is
 distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 implied. See the License for the specific language governing permissions and limitations under the
 License.
 ***************************************************************************************************/
package com.tencent.rapidview.param;

import android.content.Context;
import android.widget.AbsoluteLayout;

/**
 * @Class AbsoluteLayoutParams
 * @Desc RapidView界面AbsoluteLayout.LayoutParams解析器
 *
 * @author arlozhang
 * @date 2015.10.08
 */
public class AbsoluteLayoutParams extends ViewGroupParams {

    public AbsoluteLayoutParams(Context context){
        super(context);
    }

    @Override
    protected Object getObject(){
        return new AbsoluteLayout.LayoutParams(0, 0, 0, 0);
    }
}
